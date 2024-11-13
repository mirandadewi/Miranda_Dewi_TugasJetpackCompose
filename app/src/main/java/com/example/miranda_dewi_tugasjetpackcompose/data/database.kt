package com.example.miranda_dewi_tugasjetpackcompose.data

import com.example.miranda_dewi_tugasjetpackcompose.R
import com.example.miranda_dewi_tugasjetpackcompose.model.GalleryItem
import com.example.miranda_dewi_tugasjetpackcompose.model.DiscountItem
import com.example.miranda_dewi_tugasjetpackcompose.model.ProductItem
import com.example.miranda_dewi_tugasjetpackcompose.model.AboutItem

object database {
    val Discount = listOf(
        DiscountItem(
            id = 1,
            name = "diskon1",
            description = "Diskon untuk kue cokelat isian buah jeruk menawarkan rasa unik dengan perpaduan manis dan asam. Kue ini terbuat dari lapisan cokelat lezat yang membungkus isian segar buah jeruk, menciptakan kombinasi rasa yang menyegarkan. Nikmati penawaran spesial dengan harga lebih terjangkau!",
            photo = R.drawable.diskon1
        ),
        DiscountItem(
            id = 2,
            name = "diskon2",
            description = "Nikmati kesegaran di Fresh Cake Fest! Dapatkan diskon 25% untuk berbagai pilihan kue segar kami yang siap memanjakan lidah Anda. Dari kue buah yang lembut hingga kue cokelat yang menggoda, semuanya tersedia dengan potongan harga spesial. Manjakan diri Anda dan orang terdekat dengan kue-kue lezat kami selama promo ini berlangsung. Segera kunjungi toko kami atau pesan secara online. Jangan lewatkan kesempatan ini! Syarat dan ketentuan berlaku.",
            photo = R.drawable.diskon2
        ),
        DiscountItem(
            id = 3,
            name = "diskon3",
            description = "Rayakan hari spesial dengan kue ulang tahun terbaik dari kami! Dapatkan diskon 20% untuk setiap pembelian kue ulang tahun yang dibuat dengan bahan-bahan berkualitas dan dekorasi yang memukau. Jadikan momen ulang tahun Anda atau orang terkasih lebih berkesan dengan sentuhan manis dari kue lezat kami. Jangan lewatkan promo ini! Pesan sekarang dan nikmati potongan harga spesial. Syarat dan ketentuan berlaku.",
            photo = R.drawable.diskon3
        ),
        DiscountItem(
            id = 4,
            name = "diskon4",
            description = "Kastangel adalah kue kering khas Indonesia yang terbuat dari keju, dengan tekstur renyah dan rasa gurih yang lezat. Cocok untuk disajikan di berbagai acara atau sebagai camilan sehari-hari. Saat ini, kastangel sedang diskon 20%, memberikan kesempatan untuk menikmati rasa istimewa dengan harga lebih terjangkau.",
            photo = R.drawable.diskon4
        ),
        DiscountItem(
            id = 5,
            name = "diskon5",
            description = "Paket hemat beli 3 item dengan diskon 20% menawarkan potongan harga khusus bagi pelanggan yang membeli tiga produk sekaligus. Dengan paket ini, pelanggan dapat memilih berbagai item dan mendapatkan diskon 20% dari total harga pembelian. Ideal untuk pembelian dalam jumlah lebih, paket ini memberikan nilai lebih dengan harga yang lebih terjangkau.",
            photo = R.drawable.diskon5
        ),
        DiscountItem(
            id = 6,
            name = "diskon6",
            description = "Minggu ini, nikmati promo spesial untuk berbagai pilihan kue lezat kami! *This Week Special Cake* hadir dengan harga istimewa untuk memanjakan Anda dan keluarga. Dari rasa klasik hingga kreasi terbaru, ada banyak pilihan yang cocok untuk setiap selera. Segera kunjungi gerai kami atau pesan secara online untuk merasakan kelezatan kue spesial minggu ini. Jangan lewatkan, penawaran ini hanya berlaku terbatas!",
            photo = R.drawable.diskon6
        ),
        DiscountItem(
            id = 7,
            name = "diskon7",
            description = "Rayakan momen spesial dengan *Delicious Birthday Cake* dari kami! Dapatkan diskon 40% untuk kue ulang tahun istimewa yang dibuat dengan bahan berkualitas tinggi dan penuh rasa. Jadikan hari ulang tahun Anda atau orang terkasih semakin berkesan dengan kue yang lezat dan tampilan yang memukau. Penawaran ini terbatas, jadi jangan sampai terlewatkan! Pesan sekarang dan nikmati potongan harga spesial ini. Syarat dan ketentuan berlaku.",
            photo = R.drawable.diskon7
        ),
        DiscountItem(
            id = 8,
            name = "diskon8",
            description = "Nikmati penawaran spesial diskon 50% untuk berbagai pilihan kue lezat! Hanya untuk waktu terbatas, Anda bisa mendapatkan kue favorit dengan setengah harga. Pilihan yang sempurna untuk berbagi kebahagiaan bersama keluarga atau teman. Pesan sekarang dan rasakan manisnya penawaran ini. Jangan lewatkan kesempatan emas ini! Syarat dan ketentuan berlaku.",
            photo = R.drawable.diskon8
        ),
        DiscountItem(
            id = 9,
            name = "diskon9",
            description = "Dapatkan penawaran spesial diskon 50% untuk potongan kue kedua! Mulai 25 Juli, nikmati promo ini di gerai kami. Ini kesempatan sempurna untuk menikmati lebih banyak kue favorit Anda dengan harga lebih terjangkau. Jangan lewatkan, ajak teman atau keluarga untuk bersama-sama menikmati potongan harga ini. Syarat dan ketentuan berlaku.",
            photo = R.drawable.diskon9
        ),
        DiscountItem(
            id = 10,
            name = "diskon10",
            description = "Nikmati kelembutan dan cita rasa autentik dari Matcha Cake 100% Organic yang terbuat dari bahan-bahan alami berkualitas tinggi. Dengan rasa matcha yang khas dan tekstur lembut, kue ini sempurna untuk pecinta dessert sehat dan organik. Jangan lewatkan penawaran spesial: Dapatkan diskon 15% untuk setiap pembelian Matcha Cake. Ayo, cicipi kenikmatan alami yang menyehatkan dengan harga lebih hemat! Pesan sekarang dan rasakan sensasi unik dari Matcha Cake kami!",
            photo = R.drawable.diskon10
        ),
    )

    val Product = listOf(
        ProductItem(
            id = 1,
            name = "Bomboloni",
            description = "Bomboloni adalah donat khas Italia yang memiliki bentuk bulat dan lembut. Adonan bomboloni terbuat dari campuran tepung, telur, ragi, dan gula, yang kemudian digoreng hingga berwarna keemasan dan renyah di luar.",
            photo = R.drawable.produk1
        ),
        ProductItem(
            id = 2,
            name = "Birthday Cake",
            description = "Kue ulang tahun ini dibuat dari lapisan yang lembut dan kaya rasa, dihiasi dengan krim vanila yang halus.",
            photo = R.drawable.produk2
        ),
        ProductItem(
            id = 3,
            name = "Brownies Coklat",
            description = "Brownies cokelat ini memiliki tekstur yang lembut di dalam dengan permukaan luar yang renyah, menciptakan kombinasi yang sempurna dalam setiap gigitannya. Brownies disajikan dalam bentuk potongan tebal dan dihiasi dengan raspberry segar di atasnya, menambahkan rasa asam manis yang menyegarkan.",
            photo = R.drawable.produk3
        ),
        ProductItem(
            id = 4,
            name = "Kue Sus",
            description = "Kue sus adalah pastry klasik yang berbentuk bulat dengan tekstur luar yang renyah dan bagian dalam yang berongga. Kue ini biasanya diisi dengan vla lembut yang manis, terbuat dari campuran susu, gula, dan vanila, memberikan rasa yang creamy dan lezat.",
            photo = R.drawable.produk4
        ),
        ProductItem(
            id = 5,
            name = "Cheesecake",
            description = "Kue cheesecake yang elegan ini memiliki tekstur lembut dan creamy dengan lapisan keju yang kaya rasa. Bagian luar kue dilapisi remah biskuit yang renyah, memberikan kontras yang sempurna dengan kelembutan isinya.",
            photo = R.drawable.produk5
        ),
        ProductItem(
            id = 6,
            name = "Bolu Gulung Keju",
            description = "Kue gulung keju ini memiliki tekstur lembut dan empuk dengan lapisan luar yang dihiasi parutan keju melimpah. Setiap gulungannya diisi dengan krim manis yang memberikan kelembutan pada setiap gigitan.",
            photo = R.drawable.produk6
        ),
        ProductItem(
            id = 7,
            name = "Cookies Lumer",
            description = "Cookies lumer cokelat ini memiliki tekstur renyah di luar namun tetap lembut di dalam, memberikan sensasi yang memanjakan di setiap gigitannya.",
            photo = R.drawable.produk7
        ),
        ProductItem(
            id = 8,
            name = "Chocholate Croissant",
            description = "Chocolate croissant sejenis kue pastry yang terbuat dari adonan croissant yang berlapis dan renyah, diisi dengan cokelat di bagian tengahnya.",
            photo = R.drawable.produk8
        ),
        ProductItem(
            id = 9,
            name = "Macaroons",
            description = "macaron taro adalah varian dari macaron klasik yang memiliki rasa lembut dan manis dengan sentuhan rasa taro yang khas. Macaron ini terdiri dari dua lapisan meringue berwarna ungu muda yang renyah di luar, namun lembut dan sedikit kenyal di dalam.",
            photo = R.drawable.produk9
        ),
        ProductItem(
            id = 10,
            name = "Cupcakes",
            description = "Nutella cookie butter stuffed cupcakes adalah variasi cupcake yang menggabungkan dua rasa manis yang lezat: Nutella dan cookie butter. Cupcake ini memiliki adonan lembut dan moister di luar, yang dipanggang hingga sempurna.",
            photo = R.drawable.produk10
        ),
    )

    val Gallery = listOf(
        GalleryItem(
            id = 1,
            name = "toko1",
            photo = R.drawable.toko1
        ),
        GalleryItem(
            id = 2,
            name = "toko2",
            photo = R.drawable.toko2
        ),
        GalleryItem(
            id = 3,
            name = "toko3",
            photo = R.drawable.toko3
        ),
        GalleryItem(
            id = 4,
            name = "toko4",
            photo = R.drawable.toko4
        ),
        GalleryItem(
            id = 5,
            name = "toko5",
            photo = R.drawable.toko5
        ),
        GalleryItem(
            id = 6,
            name = "toko6",
            photo = R.drawable.toko6
        ),
        GalleryItem(
            id = 7,
            name = "toko7",
            photo = R.drawable.toko7
        ),
        GalleryItem(
            id = 8,
            name = "toko8",
            photo = R.drawable.toko8
        ),
        GalleryItem(
            id = 9,
            name = "toko9",
            photo = R.drawable.toko9
        ),
        GalleryItem(
            id = 10,
            name = "toko10",
            photo = R.drawable.toko10
        ),
        GalleryItem(
            id = 11,
            name = "toko11",
            photo = R.drawable.toko11
        ),
        GalleryItem(
            id = 12,
            name = "toko12",
            photo = R.drawable.toko12
        ),
        GalleryItem(
            id = 13,
            name = "toko13",
            photo = R.drawable.toko13
        ),
        GalleryItem(
            id = 14,
            name = "toko14",
            photo = R.drawable.toko14
        ),
    )
    val About = listOf(
        AboutItem(
            id = 1,
            name = "Miranda Dewi",
            email = "mirandadewi190@gmail.com",
            university = "Universitas Muhammadiyah Sumatera Utara",
            major = "Teknologi Informasi",
            photo = R.drawable.profile_md
        ),
    )
}