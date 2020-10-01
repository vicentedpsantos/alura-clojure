(ns shop.aula4
  (:require [shop.db :as s.db]
            [shop.logic :as s.logic]))

(println (s.db/all-orders))

(let [orders (s.db/all-orders)
      summary (s.logic/summary-by-user orders)]
  (println "Summary" summary)
  (println "Ordered" (sort-by :total-price summary))
  (println "Reversed" (reverse (sort-by :total-price summary)))
;; update-in, assoc-in, get-in
;; to work with deep nested hash maps
  (println (get-in orders [0 :items :backpack :quantity])))

(defn summary-sorted-by-user
  [orders]
  (->> orders
       l.logic/summary-by-user
       (sort-by :total-price)))
