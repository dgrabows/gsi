(ns gsi.core
  [:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :as ring-devel]
            [ring.middleware.defaults :as ring-defaults]]
  (:gen-class))

(defn hello-handler [request]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Hello World!?!"})

(def app (ring-defaults/wrap-defaults hello-handler ring-defaults/site-defaults))

(def app-proxy #(app %))

(def reloadable-app (ring-devel/wrap-reload app-proxy))

(defn run-server []
  (jetty/run-jetty reloadable-app {:port 4000}))

(defn -main
  [& args]
  (run-server))
