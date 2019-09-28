(defproject wrap-jdbc "0.1.0"
  :description "Wrap jdbc connection to your compojure handler"
  :url "https://github.com/CHNB128/wrap-jdbc"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.7.9"]
                 [metosin/compojure-api "1.1.11"]]
  :repl-options {:init-ns wrap-jdbc.core})
