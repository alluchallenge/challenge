(defproject challenge "0.1.0-SNAPSHOT"
  :description "Quick coding challenges"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :test-paths ["src"]
  :profiles {:dev {:dependencies [[pjstadig/humane-test-output "0.10.0"]]
                   :plugins [[com.jakemccrary/lein-test-refresh "0.24.0"]]
                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]}}
  :repl-options {:init-ns challenge.core}
  :aliases {"test-auto" ["test-refresh" ":changes-only"]})
