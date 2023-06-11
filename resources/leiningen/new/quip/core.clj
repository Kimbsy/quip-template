(ns {{name}}.core
  (:gen-class)
  (:require [quip.core :as qp]
            [{{name}}.scenes.menu :as menu]
            [{{name}}.scenes.level-01 :as level-01]))

(defn setup
  "The initial state of the game"
  []
  {})

(defn init-scenes
  "Map of scenes in the game"
  []
  {:menu     (menu/init)
   :level-01 (level-01/init)})

;; Configure the game
(def {{name}}-game
  (qp/game {:title          "{{name}}"
            :size           [800 600]
            :setup          setup
            :init-scenes-fn init-scenes
            :current-scene  :menu}))

(defn -main
  "Run the game"
  [& args]
  (qp/run {{name}}-game))
