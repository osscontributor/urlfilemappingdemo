class UrlMappings {

	static mappings = {

        name sitemap: "/data.xml" {
            controller = 'data'
            action = 'generate'
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
