(ns shop.aula3
  (:require [shop.db :as s.db]))

(s.db/all-orders)

(group-by :usuario (s.db/all-orders))

(defn my-grouping-function
  [element]
  (println "Element" element)
  (:user element))

(group-by my-grouping-function (s.db/all-orders))
(reduce + (map count (vals (group-by :user (s.db/all-orders)))))

(->> (s.db/all-orders)
     (group-by :user)
     (vals)
     (map count)
     (reduce +))

(defn count-total-per-user
  [[user orders]]
  {:user-id user
   :order-total (count orders)})

(->> (s.db/all-orders)
     (group-by :user)
     (map count-total-per-user))

(defn item-total
  [[item-id details]]
  (* (get details :quantity 0) (get details :unit-price 0)))

(defn order-total
  [order]
  (->> order
       (map item-total)
       (reduce +)))

(defn orders-total-price
  [orders]
  (->> orders
       (map :items)
       (map order-total)
       (reduce +)))

(defn quantity-and-amount-spent-per-user
  [[user orders]]
  {:user-id user
   :total-quantity (count orders)
   :total-price (orders-total-price orders)
   })

(->> (s.db/all-orders)
     (group-by :user)
     (map quantity-and-amount-spent-per-user))
