(ns multiclasser.core-test
  (:require [clojure.test :refer :all]
            [multiclasser.core :refer :all]))
(def classes
  [(hash-map :name "Onion Knight"
             :levels [["Fight", "Flee"], ["Weep"]]),
   (hash-map :name "Lumberjack"
             :levels [["Wield Axe", "Beard"], ["Wolfslayer"]])
   ])

(deftest verify-matching-profession
  (testing "Empty list has no matching professions"
    (is (empty? (matching-profession "Some profession" []))))
  (testing "Fetching with a non-existing profession returns an empty sequnence."
    (is (empty? (matching-profession "This doesn't exist" classes))))
  (testing "Fetching Lumberjack returns Lumberjack"
    (is (= (second classes) (matching-profession "Lumberjack" classes))))
  )
