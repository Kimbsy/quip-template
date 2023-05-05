(defproject com.github.kimbsy/lein-template.quip "1.0.0"
  :description "A Leiningen template for the Quip game library"
  :url "https://github.com/Kimbsy/quip-template"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :eval-in-leiningen true
  :deploy-repositories [["clojars" {:url           "https://clojars.org/repo/"
                                    :username      :env/clojars_user
                                    :password      :env/clojars_pass
                                    :sign-releases false}]])
