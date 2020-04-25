(ns example.handler
  (:require [integrant.core :as ig]
            [ataraxy.response :as response]
            [duct.logger :as logger]))


(defmethod ig/init-key ::index [_ log]
  (logger/log log :info "Init the index handler")
  (fn [_]
    [::response/ok
      "<HTML><HEAD><TITLE>Index</TITLE></HEAD>This is the index page</HTML>"]))
