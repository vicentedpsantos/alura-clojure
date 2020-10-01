(ns shop.logic)

(defn count-total-per-user
  [[user orders]]
  {:user-id user
   :order-total (count orders)})

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
   :total-price (orders-total-price orders)})

(defn summary-by-user
  [orders]
  (->> orders
       (group-by :user)
       (map quantity-and-amount-spent-per-user)))
