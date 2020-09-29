(ns estoque.aula5)

(def stock { "Backpack", 10 "Shirt" 5 })
(println stock)

(println "We have" (count stock) "Items in Stock")
(println "Keys are:" (keys stock))
(println "Values are:" (vals stock))

;; Usually maps are defined with keywords, as such
(def newstock { :backpack 10, :shirt 5 })

;; Ads new key-value pair to map
(assoc newstock :chair 3)

;; Update map by passing it a function
(update newstock :backpack inc)

(defn takes-one
  [value]
  (println "Takes one from" value)
  (- value 1))

;; Passing a custom function to update
(update newstock :backpack takes-one)

;; Passing a lambda
(update newstock :backpack #(- %1 1))

;; Creating maps with nested maps
(def order {:backpack {:quantity 2, :price 80}
            :shirt { :quantity 3, :price 90 }})

(def order (assoc order :keyring {:quantity 1, :price 10}))

(println order)
(get order :backpack)
(get order :chair {})
(:backpack order)
(:price (:backpack order))
(:chair order)


;; Update nested attribute
;; Increase it by 80
(update-in order [:backpack :quantity] #(+ %1 80))

;; Thread First
(-> order
    :backpack
    println)

(def
  clientes {
    :15 {
      :nome "Guilherme"
      :certificados ["Clojure" "Java" "Machine Learning"] } })

(-> clientes
    :15
    :certificados
    count)
