(ns shop.loops)

(defn conta
  [elements]
  (loop [total-up-until-now 0
         remaining-elements elements]
    (if (seq remaining-elements)
      (recur (inc total-up-until-now) (next remaining-elements))
      total-up-until-now)))

(def family ["Vicente" "Tamires" "Lana" "Maya"])

(println (conta family))

;; for loops
(def digits [0 1 2 3 4 5 6 7])

(for [x digits
      :let [y (* x 3)]
      :when (even? y)]
  y)

(for [x digits
      :let [y (+ x 100)
            z (* x 100)]]
  [y z])
