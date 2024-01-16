package Core;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Teste {
    public static void main(String[] args) {
        // Substitua 'URL_DA_API_AQUI' pela URL real da sua API
        String url = "https://www.pichau.com.br/api/catalog";

        // Corpo da solicitação (se necessário)
        String corpo = "{\"operationName\":\"products\",\"variables\":{\"onServer\":false,\"visitorId\":449613605},\"query\":\"query products($visitorId: String, $onServer: Boolean = false) {\\n  mySalesRecommendationForYou(visitorId: $visitorId) {\\n    id\\n    sku\\n    url_key\\n    name\\n    socket\\n    hide_from_search\\n    is_openbox\\n    openbox_state\\n    openbox_condition\\n    tipo_de_memoria\\n    caracteristicas\\n    slots_memoria\\n    marcas\\n    marcas_info {\\n      name\\n      __typename\\n    }\\n    product_page_layout\\n    formato_placa\\n    plataforma\\n    portas_sata\\n    slot_cooler_120\\n    slot_cooler_80\\n    slot_cooler_140\\n    slot_cooler_200\\n    coolerbox_included\\n    potencia\\n    quantidade_pacote\\n    alerta_monteseupc\\n    vgaintegrado\\n    product_set_name\\n    categories {\\n      name\\n      url_path\\n      path\\n      __typename\\n    }\\n    special_price\\n    pichau_prices {\\n      avista\\n      avista_discount\\n      avista_method\\n      base_price\\n      final_price\\n      max_installments\\n      min_installment_price\\n      __typename\\n    }\\n    price_range {\\n      __typename\\n    }\\n    description {\\n      html\\n      __typename\\n    }\\n    garantia\\n    informacoes_adicionais\\n    image {\\n      url\\n      url_listing\\n      path\\n      label\\n      __typename\\n    }\\n    media_gallery {\\n      url\\n      path\\n      label\\n      position\\n      __typename\\n    }\\n    short_description {\\n      html\\n      __typename\\n    }\\n    amasty_label {\\n      name\\n      product_labels {\\n        image\\n        position\\n        size\\n        label\\n        label_color\\n        __typename\\n      }\\n      category_labels {\\n        image\\n        position\\n        size\\n        label\\n        label_color\\n        __typename\\n      }\\n      __typename\\n    }\\n    reviews {\\n      rating\\n      count\\n      __typename\\n    }\\n    mysales_promotion {\\n      expire_at\\n      price_discount\\n      price_promotional\\n      promotion_name\\n      promotion_url\\n      qty_available\\n      qty_sold\\n      __typename\\n    }\\n    only_x_left_in_stock\\n    stock_status\\n    codigo_barra\\n    codigo_ncm\\n    meta_title @include(if: $onServer)\\n    meta_keyword @include(if: $onServer)\\n    meta_description @include(if: $onServer)\\n    __typename\\n  }\\n}\\n\"}";

        // Configuração da solicitação HTTP com cookies
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);

        HttpClient httpClient = HttpClient.newBuilder()
                .cookieHandler(CookieHandler.getDefault())
                .build();

        // Adicione os cookies ao cabeçalho da solicitação
        String cookies = "_gcl_au=1.1.1626256758.1704300479; _ga=GA1.1.4778113.1704300480; cf_clearance=ohSLWjVNLsLs1.54eKhOCv5AUFNRI8hnWH86owZX4Ik-1704300487-0-2-f231a028.2e495651.fccd8b1f-160.2.1704300487; _fw_crm_v=43a56d83-6974-451c-e31c-109074fe8670; __cf_bm=0Zaxv7IOVzFjPVsjlC9V9OGiTZlqiUSQuvLksI8RZrc-1704300611-1-AW8XnRctx+3lKr1fut2C05wPRudGbmC6TuL4AonsLuauwZMta/4+S4Mbax+riJ6dax4ECMZ6k4EKm3bBDVGXI/s=; CookieConsent=true; _ga_TX844LTGQL=GS1.1.1704300479.1.1.1704300813.25.0.0";  // Substitua com seus cookies reais
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "*/*")
                .header("accept-encoding", "gzip, deflate, br")
                .header("accept-language", "pt-BR,pt;q=0.9")
                .header("content-length", "203")
                .header("content-type", "application/json")
                .header("cookie", "_gcl_au=1.1.1626256758.1704300479; _ga=GA1.1.4778113.1704300480; cf_clearance=ohSLWjVNLsLs1.54eKhOCv5AUFNRI8hnWH86owZX4Ik-1704300487-0-2-f231a028.2e495651.fccd8b1f-160.2.1704300487; _fw_crm_v=43a56d83-6974-451c-e31c-109074fe8670; __cf_bm=0Zaxv7IOVzFjPVsjlC9V9OGiTZlqiUSQuvLksI8RZrc-1704300611-1-AW8XnRctx+3lKr1fut2C05wPRudGbmC6TuL4AonsLuauwZMta/4+S4Mbax+riJ6dax4ECMZ6k4EKm3bBDVGXI/s=; CookieConsent=true; _ga_TX844LTGQL=GS1.1.1704300479.1.1.1704300813.25.0.0")
                .header("Cookie", cookies)
                .header("origin", "https://www.pichau.com.br")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.188 Safari/537.36 CrKey/1.54.250320 Edg/120.0.0.0")
                .header("vendor", "Pichau")
                .POST(HttpRequest.BodyPublishers.ofString(corpo))
                .build();

        // Realiza a solicitação HTTP
        try

        {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Verifica se a solicitação foi bem-sucedida (código de status 200)
            if (response.statusCode() == 200) {
                // Manipule a resposta aqui (por exemplo, response.body())
                System.out.println(response.body());
            } else {
                // Se houver um erro, imprima o código de status e a mensagem de erro
                System.out.println("Erro " + response.statusCode() + ": " + response.body());
            }
        } catch(Exception e)

        {
            e.printStackTrace();
        }
    }
}

