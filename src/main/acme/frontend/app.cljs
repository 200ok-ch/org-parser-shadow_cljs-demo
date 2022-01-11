(ns acme.frontend.app
  (:require [org-parser.core :refer [read-str]]))


(defn init []
  (read-str "Foo")
  (println "Hello World"))
