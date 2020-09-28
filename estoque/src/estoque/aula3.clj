(ns estoque.aula3)

(defn discounted-amount
  "Returns the amount with a 10% discount, if appliable."
  [apply? gross-amount]
  (if (apply? gross-amount)
    (let [discount-rate (/ 10 100)
          discount (* gross-amount discount-rate)]
      (- gross-amount discount))
    gross-amount))

;; Predicate

(defn greater-than-100?
  [gross-amount]
  (> gross-amount 100))

(defn greater-than-1000?
  [gross-amount]
  (> gross-amount 1000))

(println (discounted-amount greater-than-100? 1000))

(println (discounted-amount greater-than-1000? 1200))

;; Anonymous Functions
;; Instead of defining a function to pass as argument to the discounted-amount
;; function, we can declare an anoymous function as well

(println (discounted-amount (fn[gross-amount] (> gross-amount 100)) 1200))

;; They can also be called as such

(println (discounted-amount #(> %1 100) 1200))
