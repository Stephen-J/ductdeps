(require '[eftest.runner :as eftest])


(eftest/run-tests (eftest/find-tests "test"))
