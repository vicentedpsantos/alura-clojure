;; Arguments of the function come inside square brackets. Even if
;; the function does not take any arguments, we still have to
;; list the empty brackets or our code will not run.
(defn print-message []
  (println "------------------------")
  (println "Welcome to the warehouse"))

;; We can choose to add a description of our functions like so
(defn apply-discount 
  "Description of what this function does."
  [gross-value]
  (* gross-value 0.9))

(defn discounted-value [gross-value]
  (* gross-value 0.9))

(defn discounted-value
  "Returns the value with a 10% discount."
  [gross-value]
  (* gross-value (- 1 0.1)))

;; Notice how the two functions above were deliberately named
;; differenttly. The former uses an imperative approach to its naming
;; which in Clojure by convention usually means this function will have
;; some kind of collateral effect. The latter on the other hand
;; is named in a declarative way, which usally means this has no collateral effects.
;; In functional programming printing to the screen (an impure IO) could be
;; considered a collateral effect;

(print-message)
(println (apply-discount 120))
(println (discounted-value 120))

;; Functions can also be defined in-line
(defn say-my-name [name] (println name))
(say-my-name "Vicente")

;; When using let to define symbols, the symbols are defined only
;; within the clojure where let was called.
;; If this had been defined using `def`, the symbol would have become
;; global and caused unwanted effects.
(defn discounted-amount
  "Returns the amount with a discounted 10%"
  [gross-amount]
  (let [discount 0.10]
    (* gross-amount (- 1 discount))))

;; shows class of variable
(println (class 90.0))

;; The discount symbol here is defined as 90N, which is of class BigInt.
;; Because let takes in a Vector as a parameter, we can define multiple symbols inside.
;; In this case we defining both discount-rate and discount inside the clojure of let.
;; Both these symbols are later used to calculate the discounted amount
(defn discounted-amount
  "Returns the amount with a discounted 10%"
  [gross-amount]
  (let [discount-rate (/ 10 100)
        discount      (* discount-rate gross-amount)]
    (- gross-amount discount)))

(println (discounted-amount 120))

;; IF statements
(defn discounted-amount-conditioned
  "Returns amount with discount if meets criteria"
  [amount]
  (let [minimum-amount 100
        is-greater (> amount minimum-amount)
        discount (/ 10 100)
        amount-discounted (* amount discount)]
    (if is-greater
      (- amount amount-discounted)
      amount)))

(println (discounted-amount-conditioned 10))
(println (discounted-amount-conditioned 120))

;; Null and false values are falsy in clojure
;; The closures below returns false
(if nil "verdadeiro" "falso")
(if nil "verdadeiro" "falso")
