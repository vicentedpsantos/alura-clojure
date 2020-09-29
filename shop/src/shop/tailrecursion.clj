(ns shop.tailrecursion)

(defn my-map
  [func sequen]
  (let [primeiro (first sequen)]
    (if (not (nil? primeiro))
      (do
        (func primeiro)
        (recur func (rest sequen))))))


(my-map println ["Vicente" "Tamires"])
