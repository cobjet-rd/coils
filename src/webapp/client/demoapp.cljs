(ns webapp.client.demoapp
  (:require
   [goog.net.cookies                     :as cookie]
   [om.core                              :as om    :include-macros true]
   [om.dom                               :as dom   :include-macros true]
   [webapp.framework.client.coreclient   :as c     :include-macros true]
   [cljs.core.async                      :refer [put! chan <! pub timeout]]
   [om-sync.core                         :as async]
   [clojure.data                         :as data]
   [clojure.string                       :as string]
   [ankha.core                           :as ankha]
   )
  (:use
   [webapp.framework.client.components.main                    :only   [main-view]]
   [webapp.framework.client.system-globals                     :only   [app-state  data-state  set-ab-tests]]
   )
  (:require-macros
   [cljs.core.async.macros :refer [go]])
  (:use-macros
   [webapp-config.settings  :only [setup-fn]])
  )

(c/ns-coils 'webapp.client.demoapp)




(c/defn-ui-component     demo-view   [app]
  {}

  (c/div nil
       (c/h2 nil "Demo app")
       "Demo webapp with Neo4j"))





(defn setup-properties []
  {
   :start-component
   demo-view

   :setup-fn
   (fn[]
     (do
     (reset!
      app-state

      (assoc-in
       @app-state [:ui]
       {


        }))


     (reset! data-state {
                         :submit {}
                         })


     (set-ab-tests {
                    })
  ))})


