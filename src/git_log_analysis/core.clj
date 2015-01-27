(ns git-log-analysis.core
  (:gen-class)
  (:require [clojure.java.shell :only [sh] :as shell]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (:out (shell/sh "cowsay" "Word up bitches!"))))
