(ns estoque.aula6)

(def order {:backpack {:quantity 2, :price 80}
            :shirt {:quantity 3, :price 90 }
            :keyring {:quantity 1}})

;; the argument value here is a MapEntry
(defn print-and-return-15
  [[k v]]
  (println k "e" v)
  v)

(map print-and-return-15 order)

(defn product-price
  [produto]
  (* (:quantity produto) (:price produto)))

(map product-price order)

(reduce + (map product-price order))

;; Thread Last
(defn order-total
  [order]
  (->> order
       vals
       (map product-price)
       (reduce +)))

;; Thread First
(-> order
    :backpack
    println)

(order-total order)

(defn gratuito?
  [item]
  (<= (get item :price 0) 0))

(defn pago?
  [item]
  (not (gratuito? item)))

(pago? {:price 50})

(filter #(gratuito? (second %)) order)

(def clientes [
  { :nome "Guilherme"
    :certificados ["Clojure" "Java" "Machine Learning"] }
    { :nome "Paulo"
      :certificados ["Java" "Ciência da Computação"] }
    { :nome "Daniela"
      :certificados ["Arquitetura" "Gastronomia"] }])

(defn certificates
  [cliente]
  (get cliente :certificados) [])

(->> clientes
    (map certificates)
    println)
