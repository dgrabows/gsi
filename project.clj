(defproject gsi "0.1.0-SNAPSHOT"
  :description "Example app integrating with Google Sign In"
  :url "https://github.com/dgrabows/gsi"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-jetty-adapter "1.3.2"]
                 [ring/ring-defaults "0.1.5"]
                 [ring/ring-devel "1.3.2"]]
  :main ^:skip-aot gsi.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
