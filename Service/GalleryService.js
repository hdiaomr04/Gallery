import axios from "axios";

const MYGALLERY_REST_API_URL='Http:/localhost:8080/api/gallery';

class GalleryService{
    getMygallery(){
        return axios.get(MYGALLERY_REST_API_URL);
    }

    createMygallery(mygallery){
        return axios.post(MYGALLERY_REST_API_URL, mygallery);
    }

}

export default new GalleryService();