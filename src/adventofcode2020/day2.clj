(ns adventofcode2020.day2)

(def demo-input [[1 3 "a" "abcde"]
                 [1 3 "b" "cdefg"]
                 [2 9 "c" "ccccc"]])

(defn check-min [min char pwd])

(defn check [line]
  (let [min (get line 0)
        max (get line 1)
        ch (get line 2)
        pwd (get line 3)
        freq (frequencies pwd)]
    (filter #(= (first %) (char ch)) freq)))

(check [1 3 "a" "abcde"])
