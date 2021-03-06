(defproject blog "0.1.0-SNAPSHOT"
  :description "A modular blogging platform."
  :url "https://github.com/FelixHoer/blog"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.stuartsierra/component "0.2.1"]
                 [ring/ring-core "1.2.2"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [ring/ring-anti-forgery "1.0.0-RC1"]
                 [ring/ring-ssl "0.2.1"]
                 [compojure "1.1.6"]
                 [com.novemberain/validateur "2.2.0"]
                 [selmer "0.6.9"]
                 [markdown-clj "0.9.41"]
                 [crypto-password "0.1.3"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [org.hsqldb/hsqldb "2.3.2"]
                 [postgresql "9.3-1102.jdbc41"]]
  :main blog.core
  :uberjar-name "blog-standalone.jar")
