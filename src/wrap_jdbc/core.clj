(ns wrap-jdbc.core
  (:use
   [compojure.api.meta])
  (:require
   [clojure.java.jdbc :as jdbc]))

(defmethod compojure.api.meta/restructure-param :jdbc
  [_ binding acc]
  (update-in acc [:letks] into [binding `(:jdbc ~'+compojure-api-request+)]))

(defn wrap-jdbc-connection [handler db-spec]
  (fn [req]
    (jdbc/with-db-transaction [conn db-spec]
      (handler (assoc req :jdbc conn)))))