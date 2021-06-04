#Stage Build
FROM node:12.16.1-alpine As builder
WORKDIR /usr/src/app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build --prod

#Stage Deploy
FROM nginx:1.15.8-alpine
COPY default.conf /etc/nginx/conf.d/default.conf
COPY --from=builder /usr/src/app/dist/covid-vaccine-dashboard/ /usr/share/nginx/html