(ns shop.core)

;; ["michael" "dwight" "angela" "jim" "pam"]
;; {"kevin" 37, "stanley" 56}
;; '(1 2 3 4 5)

;; map
;; reduce
;; filter

(def the-office-characters ["michael" "dwight" "angela" "jim" "pam"])
(def the-office-nil ["oscar" "ryan" "phillys" false])
(map println the-office-characters)
(println (first the-office-characters))
(println (rest the-office-characters))
(println (next the-office-characters))
(println (seq [1 2 3 4 5]))

(defn my-map
  [func sequen]
  (let [primeiro (first sequen)]
    (if (not (nil? primeiro))
      (do
        (func primeiro)
        (my-map func (rest sequen))))))

(my-map println the-office-characters)
(my-map println the-office-nil)
