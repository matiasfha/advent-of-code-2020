(ns adventofcode2020.day1
  (:require [clojure.math.combinatorics :as combo]
            [clojure.java.io :as io]))

; Demo data
; create a "variable " to store a vector of the data
(def demo-input [1721
                 979
                 366
                 299
                 675
                 1456])
;
; get the repor from a list by using count variables
; get the total possibles combinations of `count` elements
; get a lazy-seq with the combinations of `count` elements
; filter the lazy-seq of combinations and return the first element that sum 2020 of the combinations
; multiply all the elements of the resulting vector
(defn getReport [list count]
  (reduce * (first (filter #(= 2020 (apply + %)) (take (combo/count-combinations list count) (combo/combinations list count))))))

(defn read-input
  [day]
  (slurp (clojure.java.io/resource day)))

(defn- read-numbers [data]
  (->> data
       (re-seq #"-?\d+")
       (map #(Integer/parseInt %))))
; case 1
(getReport (read-numbers (read-input "input1.txt")) 2)
; case 2
(getReport (read-numbers (read-input "input1.txt")) 3)
;; (getReport demo-input 2)
;; (getReport demo-input 3)
