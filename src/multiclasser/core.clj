(ns multiclasser.core)

(defn matching-professions
  [profession known-professions]
  (let [contains-name? (fn [some-profession ] (= profession (:name some-profession)))]
    filter contains-name? known-professions))
