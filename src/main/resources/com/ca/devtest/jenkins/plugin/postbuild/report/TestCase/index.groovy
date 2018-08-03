package com.ca.devtest.jenkins.plugin.postbuild.report.TestCase

f = namespace(lib.FormTagLib)
l = namespace(lib.LayoutTagLib)
t = namespace("/lib/hudson")
st = namespace("jelly:stapler")

l.layout(title: "${my.name}") {
    st.include(page: "sidepanel.jelly", it: my.run)
    l.main_panel() {
        st.include(page: "reportDetail.groovy")
    }
}