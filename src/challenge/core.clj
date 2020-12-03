(ns challenge.core
  (:require [clojure.test :refer [deftest is]]))

;; Write a function which returns a sequence where all integers are increased by one
(defn increase-all [coll])

#_(deftest increase-all-test
  (is (= '(2 3 4 5 6)
         (increase-all [1 2 3 4 5])))

  (is (= '(5 3 2 7)
         (increase-all [4 2 1 6])))

  (is (= '(3 3 5 7)
         (increase-all [2 2 4 6])))

  (is (= '(2 2 2 4)
         (increase-all [1 1 1 3]))))

;; Write a function which returns only the odd numbers from a sequence.
(defn find-the-odd-numbers [coll])

#_(deftest find-the-odd-numbers-test
  (is (= '(1 3 5)
         (find-the-odd-numbers [1 2 3 4 5])))

  (is (= '(1)
         (find-the-odd-numbers [4 2 1 6])))

  (is (= '()
         (find-the-odd-numbers [2 2 4 6])))

  (is (= '(1 1 1 3)
         (find-the-odd-numbers [1 1 1 3]))))

;; Write a function which duplicates each element of a sequence.
(defn duplicate-a-sequence [coll])

#_(deftest duplicate-a-sequence-test
  (is (= '(1 1 2 2 3 3)
         (duplicate-a-sequence [1 2 3])))

  (is (= '(:a :a :a :a :b :b :b :b)
         (duplicate-a-sequence [:a :a :b :b])))

  (is (= '([1 2] [1 2] [3 4] [3 4])
         (duplicate-a-sequence [[1 2] [3 4]]))))

;; Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
;; RESTRICTION: do ont use clojure.core/distinct
(defn find-distinct-items [coll])

#_(deftest find-distinct-item-test
  (is (= [1 2 3 4]
         (find-distinct-items [1 2 1 3 1 2 4])))

  (is (= [:a :b :c]
         (find-distinct-items [:a :a :b :b :c :c])))

  (is (= '([2 4] [1 2] [1 3])
         (find-distinct-items '([2 4] [1 2] [1 3] [1 3]))))

  (is (= (range 50)
         (find-distinct-items (range 50)))))

;; Write a function which returns the symmetric difference of two sets.
;; The symmetric difference is the set of items belonging to one but not both of the two sets.
(defn symmetric-difference [set1 set2])

#_(deftest symmetric-difference-test
  (is (= #{2 4 6 7}
         (symmetric-difference #{1 2 3 4 5 6} #{1 3 5 7})))

  (is (= #{:a :b :c}
         (symmetric-difference #{:a :b :c} #{})))

  (is (= #{4 5 6}
         (symmetric-difference #{} #{4 5 6})))

  (is (= #{[1 2] [3 4]}
         (symmetric-difference #{[1 2] [2 3]} #{[2 3] [3 4]}))))
