(ns estoque.exercicio)

(def clientes [
  { :nome "Guilherme"
    :certificados ["Clojure" "Java" "Machine Learning"] }
    { :nome "Paulo"
      :certificados ["Java" "Ciência da Computação"] }
    { :nome "Daniela"
      :certificados ["Arquitetura" "Gastronomia"] }])

(->> clientes
    (map :certificados)
    (map count)
    (reduce +))
