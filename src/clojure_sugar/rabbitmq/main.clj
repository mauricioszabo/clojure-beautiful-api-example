(ns clojure-sugar.rabbitmq.main
  (:require [clojure-sugar.rabbitmq.rabbitmq :as rabbit]))

(defn main []
  (let [conn (rabbit/connect)
        ch (rabbit/new-channel conn)
        q (rabbit/queue ch "hello")]
    (rabbit/publish! ch rabbit/default-exchange q "Hello, world!" :routing-key (:name q))
    (rabbit/close! conn)))
