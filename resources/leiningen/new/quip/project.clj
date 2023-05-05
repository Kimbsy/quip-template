(defproject {{name}} "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [quip "2.0.2"]]
  :main ^:skip-aot {{name}}.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
