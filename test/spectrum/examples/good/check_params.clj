(ns spectrum.examples.good.check-params
  (:require [clojure.future :refer :all]
            [clojure.spec.alpha :as s]))

(s/fdef foo :args (s/cat :x int?) :ret int?)
(defn foo [x]
  x)
