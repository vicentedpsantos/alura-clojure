(def total-de-produtos 16)
(def total-de-produtos (+ total-de-produtos 3))
(println total-de-produtos)

(def estoque ["Mochila", "Camiseta"])
estoque

;; Once estoque is defined, if we want to print
;; its value to the screen, we dont have to call it inside
;; parenthesis. Remember that placing operations inside parenthesis
;; only applies to funcion calls.
(println estoque)

;; If we need to retrieve a value at a specific index of the vector estoque
;; We can do it as follows
;; Vectors can be called like this because they too implement a Function Interface (IFn)
(println (estoque 0))
(println (estoque 1))

;; If we try to retrieve value at index 2, which doesnt exist
;; we will get an IndexOutOfBoundsException

;; If we want the count the number of elements in a vector,
;; we can use the function count
(println (count estoque))

;; If we want to add another element to a vector
;; we can call the conj function
(conj estoque "Cadeira")
(println estoque)

;; Notice how calling conj and passing the vector and new element
;; as arguments did not update the original vector
;; In order to do this, we need to redefine it calling the def function
(def estoque (conj estoque "Cadeira"))
(println estoque)
