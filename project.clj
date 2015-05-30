(defproject gsi "0.1.0-SNAPSHOT"
  :description "Example app integrating with Google Sign In"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot gsi.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
