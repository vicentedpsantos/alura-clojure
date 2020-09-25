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

