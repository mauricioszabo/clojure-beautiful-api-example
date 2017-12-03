(ns clojure-sugar.rabbitmq.rabbitmq
  (:require [langohr.core      :as rmq]
            [langohr.channel   :as lch]
            [langohr.queue     :as lq]
            [langohr.basic     :as lb]))

(defn connect []
  (rmq/connect))

(defn new-channel [conn]
  (lch/open conn))

(defn queue
  ([ch name] (queue ch name {}))
  ([ch name opts]
   (lq/declare ch name opts)
   (assoc opts :name name)))

(def default-exchange {:name ""})

(defn publish! [channel exchange queue message & {:as opts}]
  (lb/publish channel
              (:name exchange)
              (:name queue)
              message
              opts))

(defn close! [conn] (rmq/close conn))
