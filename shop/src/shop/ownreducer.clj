(ns shop.ownreducer)

(def the-office-characters ["michael" "dwight" "angela" "jim" "pam"])

(defn conta
  ([elements] (conta 0 elements))
  ([total-up-until-now elements]
  (if (seq elements)
    (recur
      (inc total-up-until-now)
      (next elements))
    total-up-until-now)))

(def total-characters (conta 0 the-office-characters))
(println total-characters)
(println (conta 0 []))
(println (conta the-office-characters))


;; overflow

(defn print-this
  ([text1] (println "p1" text1))
  ([text1 text2] (println "p2" text1 "e" text2)))

(print-this "Vicente")
(print-this "Vicente" "Tamires")
