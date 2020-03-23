(defproject gorillalabs/muuntaja-cheshire "0.0.0" ;; use lein v
  :description "Cheshire/JSON format for Muuntaja"
  :url "https://github.com/gorillalabs/muuntaja"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/gorillalabs/muuntaja"
        :dir "../.."}
  :plugins [[lein-parent "0.3.2"]
            [com.roomkey/lein-v "7.0.0"]]
  :middleware [leiningen.v/version-from-scm
               leiningen.v/dependency-version-from-scm
               leiningen.v/add-workspace-data]
  :parent-project {:path "../../project.clj"
                   :inherit [:deploy-repositories]}
  :dependencies [[gorillalabs/muuntaja]
                 [cheshire "5.9.0"]])
