package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Product;
import kr.hs.dgsw.shopping_back.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Optional;

@RestController
public class AttachmentController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product/image/{id}")
    public void image(HttpServletRequest request, HttpServletResponse response, @PathVariable Long id){
        try {
            String filepath;
            String filename;

            Optional<Product> found = this.productRepository.findById(id);

            filepath = found.get().getFilepath();
            filename = found.get().getFilename();

            File file = new File(filepath);
            if (file.exists() == false) return;

            String mimeType = URLConnection.guessContentTypeFromName(file.getName());
            if (mimeType == null) mimeType = "application/octet-stream";

            response.setContentType(mimeType);
            response.setHeader("Content-Disposition", "inline; filename=\"" + filename + "\"");
            response.setContentLength((int) file.length());

            InputStream is = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(is, response.getOutputStream());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
