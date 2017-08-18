(ns multiclasser.core)

(defn matching-profession
  [profession known-professions]
  (-> (filter #(= (:name %) profession) known-professions) first))


