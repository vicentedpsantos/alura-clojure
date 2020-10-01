(ns shop.aula5
  (:require [shop.db :as s.db]
            [shop.logic :as s.logic]))

(defn spent-enough?
  [user-info]
  (> (:total-price user-info) 300))

;; using the function keep you can both map a vector
;; and filter it at the same time. When you dont want an element
;; to be returned by keep, simply return nil in its place
;; and it will not be maintained in the resulting vector
(let [orders (s.db/all-orders)
      summary (s.logic/summary-by-user orders)]
  (println (keep spent-enough? summary)))


