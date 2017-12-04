(ns clojure-sugar.web.routing
  (:require [compojure.core :as r]))

(defmacro defroutes [name & routes]
  `(r/defroutes ~name ~@routes))
