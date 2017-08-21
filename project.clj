(defproject insn "0.1.2"
  :description "Functional JVM bytecode generation for Clojure."
  :url "https://github.com/jgpc42/insn"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]]

  :min-lein-version "2.0.0"

  :aliases {"run-test" ["with-profile" "+test" "run" "-m" "insn.test"]
            "test" ["do" "run-test," "with-profile" "+external-asm" "run-test"]}

  :profiles
  {:external-asm {:dependencies [[org.ow2.asm/asm "5.2"]]
                  :jvm-opts ["-Dinsn.objectweb-asm"]}
   :repl {:source-paths ["dev"]}})
