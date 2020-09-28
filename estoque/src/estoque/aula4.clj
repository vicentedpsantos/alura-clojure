(ns estoque.aula4)

(def prices [30 700 1000])

;; A vector's element can be accessed passing it an index and
;; using it as a function. However, if the element accessed does not
;; exist, it will throw an out of bounds error.
(println (prices 0))

;; If we want to prevent the OOB error, we can use the function get instead.
;; We can pass it a second argument which is the fallback value.

;; returns nil
(println (get prices 17))

;; returns 0
(println (get prices 17 0))

;; Adds element to vector (IPersistent)
(println (conj prices 5))

;; update vector at index 0 with function inc (IPersistent)
(update prices 0 inc)
(update prices 1 dec)

(defn sum-1
  [value]
  (println "Summing 1 to" value)
  (+ value 1))

(update prices 0 sum-1)

(defn apply-discount?
  [gross-amount]
  (> gross-amount 100))

(defn discounted-value
  [gross-amount]
  (if (apply-discount? gross-amount)
    (let [discount-rate (/ 10 100)
          discount (* gross-amount discount-rate)]
      (- gross-amount discount))
    gross-amount))

;; Mapping through prices and returning discounted amounts
(map discounted-value prices)

;; Create range of numbers
(range 10)

;; Filter even numbers
(filter even? (range 10))

;; Using custom function as filter
(filter apply-discount? prices)

;; Mapping return from filter
(map discounted-value (filter apply-discount? prices))

;; Reduce vector into single value
(println prices)
(reduce + prices)

(defn my-sum
  [value-1 value-2]
  (println "Somando" value-1 value-2)
  (+ value-1 value-2))

;; Use function with reduce
(reduce my-sum prices)
(reduce my-sum (range 20))

;; We can also pass an initial value to the reduce function
(reduce my-sum 10 prices)













