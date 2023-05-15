(ns leiningen.new.quip
  (:require [leiningen.new.templates :as tmpl]
            [leiningen.core.main :as main]))

(def render (tmpl/renderer "quip"))

(defn quip
  "Create a basic quip project"
  [name]
  (let [data {:name name
              :sanitized (tmpl/name-to-path name)}]
    (main/info "Generating fresh 'lein new' quip/quip project.")
    (tmpl/->files data
                  "src"
                  "resources"
                  ["project.clj" (render "project.clj" data)]
                  ["README.md" (render "README.md" data)]
                  [".gitignore" (render "gitignore" data)]
                  ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
                  ["src/{{sanitized}}/scenes/menu.clj" (render "menu.clj" data)]
                  ["src/{{sanitized}}/scenes/level_01.clj" (render "level_01.clj" data)])))
