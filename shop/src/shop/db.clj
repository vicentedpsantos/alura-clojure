(ns shop.db)

(def order1 {:user 15
             :items {:backpack { :id :backpack, :quantity 2, :unit-price 10 }
                     :shirt    { :id :shirt, :quantity 3, :unit-price 40 }
                     :shoes    { :id :shoes, :quantity 1 }}})

(def order2 {:user 1
             :items {:backpack { :id :backpack, :quantity 2, :unit-price 10 }
                     :shirt    { :id :shirt, :quantity 3, :unit-price 40 }
                     :shoes    { :id :shoes, :quantity 1 }}})

(def order3 {:user 15
             :items {:backpack { :id :backpack, :quantity 2, :unit-price 10 }
                     :shirt    { :id :shirt, :quantity 3, :unit-price 40 }
                     :shoes    { :id :shoes :quantity 1 }}})

(def order4 {:user 15
             :items {:backpack { :id :backpack, :quantity 2, :unit-price 10 }
                     :shirt    { :id :shirt, :quantity 3, :unit-price 40 }
                     :shoes    { :id :shoes, :quantity 1 }}})

(def order5 {:user 10
             :items {:backpack { :id :backpack, :quantity 20, :unit-price 10 }
                     :shirt    { :id :shirt, :quantity 3, :unit-price 40 }
                     :shoes    { :id :shoes, :quantity 1 }}})

(def order6 {:user 20
             :items {:backpack { :id :backpack, :quantity 2, :unit-price 10 }
                     :shirt    { :id :shirt, :quantity 10, :unit-price 40 }
                     :shoes    { :id :shoes, :quantity 1 }}})

(defn all-orders []
  [order1, order2, order3, order4, order5, order6])
