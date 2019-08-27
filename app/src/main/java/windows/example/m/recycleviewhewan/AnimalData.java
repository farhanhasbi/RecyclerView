package windows.example.m.recycleviewhewan;

import java.util.ArrayList;

public class AnimalData {
    public static String[][] data = new String[][]{
            {"Elang Flores", "Elang flores (Nisaetus floris) merupakan jenis elang berukuran besar, sekitar 71-82 cm, yang turut memperkaya keragaman burung di tanah air. Meskipun namanya elang flores, burung ini dapat dijumpai juga di Pulau Lombok, Sumbawa, serta pulau kecil Satonda dan Rinca, selain tentu saja di Pulau Flores, Nusa Tenggara.", "http://masterburung.info/wp-content/uploads/2019/07/Ketahuilah-7-Fakta-Unik-Burung-Elang-Flores-Yang-Terancam-Punah.jpg"},
            {"Gelada", "Gelada (Theropithecus gelada) merupakan monyet yang tampak seperti baboon. Primata ini hanya bisa ditemukan di dataran tinggi Ethiopia.Kumpulan gelada sangatlah kompak. Jika salah satu anggota terancam, mereka segera menyerang secara membabi-buta dengan gigi tajam dan cakar mereka. Tak peduli itu manusia atau hewan lain yang lebih besar dan buas.", "https://res.cloudinary.com/link-ethiopia/image/upload/v1435678056/PICT0029-2-e1402317244538_odvtgl.jpg"},
            {"Kanguru Pohon",  "Kanguru pohon (Dendrolagus) memiliki tubuh dengan dua warna gradasi yang indah. Biasanya mereka berwarna cokelat kemerahan, cokelat tua atau abu-abu. Bulunya lembut dan pendek sehingga membuatnya tampak begitu menggemaskan.Telinga dan mulutnya kecil, keempat kakinya juga berbeda ukuran, kaki belakangnya lebih pendek sedangkan kaki depan mereka berukuran panjang. Kanguru pohon juga punya ekor berbulu yang panjang sebagai pembantu keseimbangan tubuhnya.", "https://alamendah.files.wordpress.com/2009/08/dendrolagus-pulcherrimus.jpg"},
            {"Lemur Bambu Besar",  "Lemur Bambu Besar ( Prolemur simus ), juga dikenal sebagai lemur yang berhidung lebar , lemur bambu terbesar memiliki berat sekitar lima pon atau hampir 2,5 kilogram. Karakteristik Bulunya seperti berwarna coklat keabu-abuan dan jambul telinga putih, dan memiliki panjang kepala sekitar satu setengah kaki, atau empat puluh sampai lima puluh cm. Mereka memiliki ekor yang relatif panjang dan kaki belakang yang panjang untuk melompat secara vertikal di antara pepohonan habitat hutan mereka.", "https://upload.wikimedia.org/wikipedia/commons/2/2d/Prolemur_simus_Cedric_Girard-Buttoz.jpg"},
            {"Kadal Berduri",  "Kadal Berduri (moloch horridus) memiliki bentuk tubuh yang diselimuti duri. Duri-duri yang berada di sekujur tubuhnya berfungsi untuk melindunginya dari predator liar yang kerap memangsanya seperti ular, burung elang dan dingo", "https://upload.wikimedia.org/wikipedia/commons/5/5f/Thornydevil02.jpg"},
            {"Badak Putih",  "Badak Putih (Ceratotherium simum) adalah salah satu dari lima spesies badak yang masih ada dan salah satu dari sedikit spesies megafauna yang tersisa. Binatang ini adalah binatang darat besar yang masih ada di dunia setelah gajah", "https://upload.wikimedia.org/wikipedia/commons/6/6d/Ceratotherium_simum_kwh_2.jpg"},
            {"Komodo",  "Komodo (Varanus komodoensis) merupakan spesies kadal terbesar di dunia yang panjangnya bisa mencapai 3 meter. Ia tergolong predator buas yang bisa menyerang rusa dan manusia", "https://upload.wikimedia.org/wikipedia/commons/5/50/Varanus_komodoensis1.jpg"},
            {"Hiu malaikat",  "Hiu Malaikat (Squatina) adalah sebuah spesies hiu yang menyerupai ikan pari, Panjang maksimal pejantan adalah 118, sementara betina dapat mencapai 152 cm, Hiu malaikat pasifik, tidak seperti hiu lainnya, mediami dasar laut, Hiu malaikat pasifik bersifat karnivora, dan umumnya mereka memangsa ikan dan sefalopoda (cumi-cumi dan gurita).", "http://samudranesia.id/wp-content/uploads/2017/08/Hiu-Malaikat.jpg"},
            {"Macan Tutul Amur", "Macan Tutul Amur (Panthera pardus orientalis) memiliki kulit sangat tebal dan pola yang keren banget! Sama seperti macan tutul lainnya, amur leopard bisa lari dengan kecepatan lebih dari 59 km/jam. Amur Leopard bisa melompat horizontal lebih dari 5,8 meter dan vertikal hingga 3 meter dalam sekali melompat. Ia dapat hidup 10-15 tahun di alam liar, sedangkan di penangkaran bisa mencapai 20 tahun", "https://c402277.ssl.cf1.rackcdn.com/photos/8405/images/story_full_width/2004_Mar_28_cam30.jpg?1424447352"},
            {"Harimau Siberia", "Harimau Siberia (Panthera tigris altaica) adalah subspesies harimau yang habitatnya berada di wilayah Amur di Timur Jauh dan berstatus dilindungi. Harimau siberia dianggap sebagai subspesies terbesar dari enam subspesies harimau", "https://upload.wikimedia.org/wikipedia/commons/b/b9/P.t.altaica_Tomak_Male.jpg"},
            {"Vaquita", "Vaquita (Phocoena sinus) adalah spesies lumba-lumba langka yang endemik di bagian utara Teluk California. Sejak baiji diyakini telah punah pada tahun 2006, vaquita menjadi cetacea yang paling terancam punah di dunia.", "https://i0.wp.com/ladyfreethinker.org/wp-content/uploads/2018/04/vaquita.jpg?resize=970%2C580&ssl=1"},
            {"Saola", "Saola (Pseudoryx nghetinhensis) adalah salah satu mamalia besar terlangka di dunia, ia adalah hewan sejenis sapi yang hanya ditemukan di Deretan Annam di Vietnam dan Laos. Hewan ini berkerabat dengan antelop, sapi, dan kambing", "https://4.bp.blogspot.com/-7UJSAus6v0w/WMWdgB74dPI/AAAAAAAAFQs/rON0JCbwq1AdWI2YdzDGHXnaO1Y7KeSlQCLcB/s1600/saola%2B%25281%2529.jpg"},
    };
    public static ArrayList<Animal> getListData(){
        ArrayList<Animal> list = new ArrayList<>();
        for (String[] aData : data) {
            Animal animal = new Animal();
            animal.setName(aData[0]);
            animal.setFrom(aData[1]);
            animal.setPhoto(aData[2]);
            list.add(animal);
        }
        return list;
    }
}

