(ns clojure-sugar.web.routes
  (:require [clojure-sugar.web.routing :as r]))

(r/defroutes routes)
;   (r/resources :users clojure-sugar.web.controllers.users)
;
;   (r/namespace "/admin"
;     (r/plug clojure-sugar.web.controllers.admin/authenticate)
;
;     (r/get "/secret-page" clojure-sugar.web.controllers.admin/secret)))
