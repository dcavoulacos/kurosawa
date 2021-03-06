(ns org.purefn.kurosawa.k8s
  "Kubernetes configuration and deployment helpers."
  (:require [org.purefn.kurosawa.config :as config]))

;;------------------------------------------------------------------------------
;; API
;;------------------------------------------------------------------------------

(defn kubernetes?
  "[DEPRECATED] -- always returns true.

  'Is the program currently running in a Kubernetes container?'

  This was a leaky abstraction, the application needn't be concerned with
  where/how it is being run."
  []
  true)

(defn config-map
  "[DEPRECATRED]

  Pass through to `org.purefn.kurosawa.config/fetch-config`"
  ([name]
   (config/fetch name))
  ([]
   (config-map "")))

(defn secrets
  "[DEPRECATRED]

  Pass through to `org.purefn.kurosawa.config/fetch-config`"
  ([name]
   (config/fetch name))
  ([]
   (secrets "")))
