(ns multiclasser.core-test
  (:require [clojure.test :refer :all]
            [multiclasser.core :refer :all]))
(def classes
  [(hash-map :name "Onion Knight"
    :levels [["Fight", "Flee"], ["Weep"]]),
    (hash-map :name "Lumberjack"
              :levels [["Wield Axe", "Beard"], ["Wolfslayer"]])
    ])

(deftest verify-matching-professions
  (testing "Empty list has no matching professions"
    (is (empty? (matching-professions "Some profession" []))))
  (testing "Fetching Onion Knight returns only one item"
    (is (= (matching-professions "Onion Knight" classes) (first classes))))
  (testing "Fetching with a non-existing profession returns an empty sequnence."
    (is (empty? (matching-professions "This doesn't exist" classes))))
  )
